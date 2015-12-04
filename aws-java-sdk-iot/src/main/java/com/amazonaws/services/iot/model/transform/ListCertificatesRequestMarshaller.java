/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * ListCertificatesRequest Marshaller
 */
public class ListCertificatesRequestMarshaller implements
        Marshaller<Request<ListCertificatesRequest>, ListCertificatesRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<ListCertificatesRequest> marshall(
            ListCertificatesRequest listCertificatesRequest) {

        if (listCertificatesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ListCertificatesRequest> request = new DefaultRequest<ListCertificatesRequest>(
                listCertificatesRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/certificates";

        request.setResourcePath(uriResourcePath);

        String pageSize = (listCertificatesRequest.getPageSize() == null) ? null
                : StringUtils
                        .fromInteger(listCertificatesRequest.getPageSize());
        if (pageSize != null) {
            request.addParameter("pageSize", pageSize);
        }

        String marker = (listCertificatesRequest.getMarker() == null) ? null
                : StringUtils.fromString(listCertificatesRequest.getMarker());
        if (marker != null) {
            request.addParameter("marker", marker);
        }

        String ascendingOrder = (listCertificatesRequest.getAscendingOrder() == null) ? null
                : StringUtils.fromBoolean(listCertificatesRequest
                        .getAscendingOrder());
        if (ascendingOrder != null) {
            request.addParameter("isAscendingOrder", ascendingOrder);
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "binary/octet-stream");
        }

        return request;
    }

}
