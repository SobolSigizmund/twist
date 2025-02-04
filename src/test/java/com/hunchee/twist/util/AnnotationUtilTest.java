/**
 *
 * Copyright (c) 2014 Kerby Martino and others. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *  __            __       __
 * |  |_.--.--.--|__.-----|  |_
 * |   _|  |  |  |  |__ --|   _|
 * |____|________|__|_____|____|
 * :: Twist :: Object Mapping ::
 *
 */
package com.hunchee.twist.util;

import com.hunchee.twist.LocalDatastoreTestBase;
import com.hunchee.twist.entity.RootEntityWithAnno;
import com.hunchee.twist.annotations.Entity;
import com.hunchee.twist.entity.RootEntityWithNoAnno;
import org.junit.Test;

import java.lang.annotation.Annotation;
import static org.junit.Assert.*;

public class AnnotationUtilTest extends LocalDatastoreTestBase {
    @Test
    public void test(){
        Annotation a = AnnotationUtil.getClassAnnotation(Entity.class, new RootEntityWithNoAnno());
        assertNotNull(a);
        assertTrue(a instanceof Entity);
        Entity e = (Entity) a;
        assertEquals("", e.name());
    }

    @Test
    public void testWithCustomName(){
        Annotation a = AnnotationUtil.getClassAnnotation(Entity.class, new RootEntityWithAnno());
        assertNotNull(a);
        assertTrue(a instanceof Entity);
        Entity e = (Entity) a;
        assertEquals("CustomEntityName", e.name());
    }
}
