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
package com.hunchee.twist;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;

import java.util.IdentityHashMap;

public interface Marshaller {
    /**
     *
     * @param parent key or null
     * @param object to marshall
     * @return marshalled object
     */
    public abstract IdentityHashMap<Object, Entity> marshall(Key parent, Object object);
}