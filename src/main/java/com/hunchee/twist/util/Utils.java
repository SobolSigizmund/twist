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

/**
 * A utility class.
 *
 *
 */
public final class Utils {

    private Utils() {

    }

    /**
     * Helper method to assert the condition is satisfied.
     *
     * @param condition the condition to assert.
     * @param msg the message if condition is not satisfied.
     */
    public static void assertTrue(boolean condition, String msg) {
        if (!condition) {
            if (msg != null) {
                throw new RuntimeException(msg);
            } else {
                throw new RuntimeException();
            }
        }
    }
}