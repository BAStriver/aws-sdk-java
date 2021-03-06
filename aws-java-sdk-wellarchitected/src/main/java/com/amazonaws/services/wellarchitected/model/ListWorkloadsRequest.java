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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to list all workloads.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ListWorkloads" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListWorkloadsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String workloadNamePrefix;

    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for this request.
     * </p>
     */
    private Integer maxResults;

    /**
     * @param workloadNamePrefix
     */

    public void setWorkloadNamePrefix(String workloadNamePrefix) {
        this.workloadNamePrefix = workloadNamePrefix;
    }

    /**
     * @return
     */

    public String getWorkloadNamePrefix() {
        return this.workloadNamePrefix;
    }

    /**
     * @param workloadNamePrefix
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadsRequest withWorkloadNamePrefix(String workloadNamePrefix) {
        setWorkloadNamePrefix(workloadNamePrefix);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for this request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for this request.
     * </p>
     * 
     * @return The maximum number of results to return for this request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for this request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListWorkloadsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkloadNamePrefix() != null)
            sb.append("WorkloadNamePrefix: ").append(getWorkloadNamePrefix()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkloadsRequest == false)
            return false;
        ListWorkloadsRequest other = (ListWorkloadsRequest) obj;
        if (other.getWorkloadNamePrefix() == null ^ this.getWorkloadNamePrefix() == null)
            return false;
        if (other.getWorkloadNamePrefix() != null && other.getWorkloadNamePrefix().equals(this.getWorkloadNamePrefix()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadNamePrefix() == null) ? 0 : getWorkloadNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListWorkloadsRequest clone() {
        return (ListWorkloadsRequest) super.clone();
    }

}
