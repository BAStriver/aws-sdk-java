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
package com.amazonaws.services.ioteventsdata.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ioteventsdata.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListDetectorsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListDetectorsRequestMarshaller {

    private static final MarshallingInfo<String> DETECTORMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("detectorModelName").build();
    private static final MarshallingInfo<String> STATENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("stateName").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("nextToken").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("maxResults").build();

    private static final ListDetectorsRequestMarshaller instance = new ListDetectorsRequestMarshaller();

    public static ListDetectorsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListDetectorsRequest listDetectorsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listDetectorsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listDetectorsRequest.getDetectorModelName(), DETECTORMODELNAME_BINDING);
            protocolMarshaller.marshall(listDetectorsRequest.getStateName(), STATENAME_BINDING);
            protocolMarshaller.marshall(listDetectorsRequest.getNextToken(), NEXTTOKEN_BINDING);
            protocolMarshaller.marshall(listDetectorsRequest.getMaxResults(), MAXRESULTS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
