/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lookoutforvision.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lookoutforvision.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DatasetMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatasetMetadataMarshaller {

    private static final MarshallingInfo<String> DATASETTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DatasetType").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusMessage").build();

    private static final DatasetMetadataMarshaller instance = new DatasetMetadataMarshaller();

    public static DatasetMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DatasetMetadata datasetMetadata, ProtocolMarshaller protocolMarshaller) {

        if (datasetMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(datasetMetadata.getDatasetType(), DATASETTYPE_BINDING);
            protocolMarshaller.marshall(datasetMetadata.getCreationTimestamp(), CREATIONTIMESTAMP_BINDING);
            protocolMarshaller.marshall(datasetMetadata.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(datasetMetadata.getStatusMessage(), STATUSMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
