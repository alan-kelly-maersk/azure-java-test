// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package rediscache.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The object that describes the operation.
 */
@Fluent
public final class OperationDisplay implements JsonSerializable<OperationDisplay> {
    /*
     * Friendly name of the resource provider
     */
    private String provider;

    /*
     * Operation type: read, write, delete, listKeys/action, etc.
     */
    private String operation;

    /*
     * Resource type on which the operation is performed.
     */
    private String resource;

    /*
     * Friendly name of the operation
     */
    private String description;

    /**
     * Creates an instance of OperationDisplay class.
     */
    public OperationDisplay() {
    }

    /**
     * Get the provider property: Friendly name of the resource provider.
     * 
     * @return the provider value.
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * Set the provider property: Friendly name of the resource provider.
     * 
     * @param provider the provider value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the operation property: Operation type: read, write, delete, listKeys/action, etc.
     * 
     * @return the operation value.
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * Set the operation property: Operation type: read, write, delete, listKeys/action, etc.
     * 
     * @param operation the operation value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay setOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Get the resource property: Resource type on which the operation is performed.
     * 
     * @return the resource value.
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource type on which the operation is performed.
     * 
     * @param resource the resource value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay setResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the description property: Friendly name of the operation.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Friendly name of the operation.
     * 
     * @param description the description value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("provider", this.provider);
        jsonWriter.writeStringField("operation", this.operation);
        jsonWriter.writeStringField("resource", this.resource);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationDisplay from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationDisplay if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationDisplay.
     */
    public static OperationDisplay fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationDisplay deserializedOperationDisplay = new OperationDisplay();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provider".equals(fieldName)) {
                    deserializedOperationDisplay.provider = reader.getString();
                } else if ("operation".equals(fieldName)) {
                    deserializedOperationDisplay.operation = reader.getString();
                } else if ("resource".equals(fieldName)) {
                    deserializedOperationDisplay.resource = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedOperationDisplay.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationDisplay;
        });
    }
}
