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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCoipPoolsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the address pools.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CoipPool> coipPools;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the address pools.
     * </p>
     * 
     * @return Information about the address pools.
     */

    public java.util.List<CoipPool> getCoipPools() {
        if (coipPools == null) {
            coipPools = new com.amazonaws.internal.SdkInternalList<CoipPool>();
        }
        return coipPools;
    }

    /**
     * <p>
     * Information about the address pools.
     * </p>
     * 
     * @param coipPools
     *        Information about the address pools.
     */

    public void setCoipPools(java.util.Collection<CoipPool> coipPools) {
        if (coipPools == null) {
            this.coipPools = null;
            return;
        }

        this.coipPools = new com.amazonaws.internal.SdkInternalList<CoipPool>(coipPools);
    }

    /**
     * <p>
     * Information about the address pools.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCoipPools(java.util.Collection)} or {@link #withCoipPools(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param coipPools
     *        Information about the address pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCoipPoolsResult withCoipPools(CoipPool... coipPools) {
        if (this.coipPools == null) {
            setCoipPools(new com.amazonaws.internal.SdkInternalList<CoipPool>(coipPools.length));
        }
        for (CoipPool ele : coipPools) {
            this.coipPools.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the address pools.
     * </p>
     * 
     * @param coipPools
     *        Information about the address pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCoipPoolsResult withCoipPools(java.util.Collection<CoipPool> coipPools) {
        setCoipPools(coipPools);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCoipPoolsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCoipPools() != null)
            sb.append("CoipPools: ").append(getCoipPools()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCoipPoolsResult == false)
            return false;
        DescribeCoipPoolsResult other = (DescribeCoipPoolsResult) obj;
        if (other.getCoipPools() == null ^ this.getCoipPools() == null)
            return false;
        if (other.getCoipPools() != null && other.getCoipPools().equals(this.getCoipPools()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoipPools() == null) ? 0 : getCoipPools().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCoipPoolsResult clone() {
        try {
            return (DescribeCoipPoolsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
