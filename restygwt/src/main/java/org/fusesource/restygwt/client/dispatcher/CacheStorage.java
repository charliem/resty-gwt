/**
 * Copyright (C) 2009-2010 the original author or authors.
 * See the notice.md file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fusesource.restygwt.client.dispatcher;

import java.util.HashMap;

import com.google.gwt.http.client.Response;

public class CacheStorage {

    private static HashMap<CacheKey, Response> cache = new HashMap<CacheKey, Response>();

    // private static HashMap<Integer, ArrayList<AsyncCallback<Integer>>>
    // pendingCallbacks
    // = new HashMap<Integer, ArrayList<AsyncCallback<Integer>>>();

    public static Response getResultOrReturnNull(CacheKey key) {

        Response val = cache.get(key);

        return val;

    }

    public static void putResult(CacheKey key, Response response) {

        cache.put(key, response);

    }

}
