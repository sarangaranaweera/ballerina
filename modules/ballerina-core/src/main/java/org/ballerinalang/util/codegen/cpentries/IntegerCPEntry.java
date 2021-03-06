/*
*  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.ballerinalang.util.codegen.cpentries;

/**
 * {@code IntegerCPEntry} represents a Ballerina int value in the constant pool.
 *
 * @since 0.87
 */
public class IntegerCPEntry implements ConstantPoolEntry {

    private long value;

    public IntegerCPEntry(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public EntryType getEntryType() {
        return EntryType.CP_ENTRY_INTEGER;
    }

    @Override
    public int hashCode() {
        return (int) value;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof IntegerCPEntry && value == (((IntegerCPEntry) obj).value);
    }
}
