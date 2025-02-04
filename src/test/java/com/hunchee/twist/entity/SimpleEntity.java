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
package com.hunchee.twist.entity;

import com.hunchee.twist.annotations.Child;
import com.hunchee.twist.annotations.Embedded;
import com.hunchee.twist.annotations.Entity;
import com.hunchee.twist.annotations.Id;

import java.util.Date;
import java.util.List;

@Entity
public class SimpleEntity {

    @Id
    private String key;
    private Integer count;
    private Date created;


    public SimpleEntity() {}

    public SimpleEntity(String key) {
        this.key = key;
    }

    public SimpleEntity(String key, Integer count){
        setId(key);
        setCount(count);
    }

    public String getKey() {
        return key;
    }

    public void setId(String key) {
        this.key = key;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "SimpleEntity"
                +" key="+ key
                +" count=" + count;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
