/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.ballerina.core.runtime.errors.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wso2.ballerina.core.interpreter.Context;
import org.wso2.ballerina.core.runtime.core.BalCallback;

/**
 * {@code DefaultErrorHandler} is the default error handler implementation
 */
public class DefaultErrorHandler implements ErrorHandler {

    private static final Logger log = LoggerFactory.getLogger(DefaultErrorHandler.class);

    private DefaultErrorHandler(){}

    private static DefaultErrorHandler instance = new DefaultErrorHandler();

    public static DefaultErrorHandler getInstance() {
        return instance;
    }

    @Override
    public void handleError(Exception ex, Context bContext, BalCallback callback) {
        log.error(ex.getMessage());
    }

    @Override
    public String getProtocol() {
        return null;
    }


}