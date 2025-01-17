// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package rediscache.models;

/**
 * Role of the linked server.
 */
public enum ReplicationRole {
    /**
     * Enum value Primary.
     */
    PRIMARY("Primary"),

    /**
     * Enum value Secondary.
     */
    SECONDARY("Secondary");

    /**
     * The actual serialized value for a ReplicationRole instance.
     */
    private final String value;

    ReplicationRole(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ReplicationRole instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ReplicationRole object, or null if unable to parse.
     */
    public static ReplicationRole fromString(String value) {
        if (value == null) {
            return null;
        }
        ReplicationRole[] items = ReplicationRole.values();
        for (ReplicationRole item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.value;
    }
}
