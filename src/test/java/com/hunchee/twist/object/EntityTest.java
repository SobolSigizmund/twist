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
package com.hunchee.twist.object;

import com.google.appengine.api.datastore.*;
import com.hunchee.twist.LocalDatastoreTestBase;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by kerby on 5/2/14.
 */
public class EntityTest extends LocalDatastoreTestBase {

    DatastoreService _ds = DatastoreServiceFactory.getDatastoreService();

    @Test
    public void test(){
        Entity e = new Entity(KeyFactory.createKey("TestKind", "TestKey"));
        Key key = _ds.put(e);
        try {
            Entity test = _ds.get(key);
            assertNotNull(test);
        } catch (EntityNotFoundException e1) {
            e1.printStackTrace();
        }
    }
}
