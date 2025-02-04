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

import java.util.List;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.repackaged.com.google.common.collect.Lists;

/**
 * Utility functions for dealing with entities.
 *
 * */
public class EntityUtil {
  
  private EntityUtil() {
    // Utility classes should have a private constructor.
  }
  
  /**
   * Checks to see whether a collection of entities all belong to the same entity group.
   * Entity groups and keys are explained in the
   * @see <a href="http://code.google.com/appengine/docs/python/datastore/keysandentitygroups.html">
   *   Google App Engine docs.
   * </a>
   * 
   * @param entities the entities to check.
   * @return {@code true} if all the entities are in the same entity group.
   */
  public static boolean inSameEntityGroup(Entity... entities) {
    List<Key> keys = Lists.newArrayList();
    
    for (Entity entity : entities) {
      keys.add(entity.getKey());
    }
    
    return KeyUtil.inSameEntityGroup(keys.toArray(new Key[keys.size()]));
  }
  
}
