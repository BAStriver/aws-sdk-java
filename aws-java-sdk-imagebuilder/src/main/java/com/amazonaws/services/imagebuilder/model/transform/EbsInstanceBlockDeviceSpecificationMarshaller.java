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
package com.amazonaws.services.imagebuilder.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * EbsInstanceBlockDeviceSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class EbsInstanceBlockDeviceSpecificationMarshaller {

    private static final MarshallingInfo<Boolean> ENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encrypted").build();
    private static final MarshallingInfo<Boolean> DELETEONTERMINATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deleteOnTermination").build();
    private static final MarshallingInfo<Integer> IOPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("iops").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<String> SNAPSHOTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("snapshotId").build();
    private static final MarshallingInfo<Integer> VOLUMESIZE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeSize").build();
    private static final MarshallingInfo<String> VOLUMETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("volumeType").build();

    private static final EbsInstanceBlockDeviceSpecificationMarshaller instance = new EbsInstanceBlockDeviceSpecificationMarshaller();

    public static EbsInstanceBlockDeviceSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(EbsInstanceBlockDeviceSpecification ebsInstanceBlockDeviceSpecification, ProtocolMarshaller protocolMarshaller) {

        if (ebsInstanceBlockDeviceSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ebsInstanceBlockDeviceSpecification.getEncrypted(), ENCRYPTED_BINDING);
            protocolMarshaller.marshall(ebsInstanceBlockDeviceSpecification.getDeleteOnTermination(), DELETEONTERMINATION_BINDING);
            protocolMarshaller.marshall(ebsInstanceBlockDeviceSpecification.getIops(), IOPS_BINDING);
            protocolMarshaller.marshall(ebsInstanceBlockDeviceSpecification.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(ebsInstanceBlockDeviceSpecification.getSnapshotId(), SNAPSHOTID_BINDING);
            protocolMarshaller.marshall(ebsInstanceBlockDeviceSpecification.getVolumeSize(), VOLUMESIZE_BINDING);
            protocolMarshaller.marshall(ebsInstanceBlockDeviceSpecification.getVolumeType(), VOLUMETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
