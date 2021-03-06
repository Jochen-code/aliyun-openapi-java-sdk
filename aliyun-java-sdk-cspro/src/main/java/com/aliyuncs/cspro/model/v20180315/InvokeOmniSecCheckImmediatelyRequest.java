/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InvokeOmniSecCheckImmediatelyRequest extends RpcAcsRequest<InvokeOmniSecCheckImmediatelyResponse> {
	
	public InvokeOmniSecCheckImmediatelyRequest() {
		super("cspro", "2018-03-15", "InvokeOmniSecCheckImmediately", "cspro");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	private String checkType;

	private String checkTarget;

	private String confType;

	public String getCheckType() {
		return this.checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
		if(checkType != null){
			putBodyParameter("CheckType", checkType);
		}
	}

	public String getCheckTarget() {
		return this.checkTarget;
	}

	public void setCheckTarget(String checkTarget) {
		this.checkTarget = checkTarget;
		if(checkTarget != null){
			putBodyParameter("CheckTarget", checkTarget);
		}
	}

	public String getConfType() {
		return this.confType;
	}

	public void setConfType(String confType) {
		this.confType = confType;
		if(confType != null){
			putBodyParameter("ConfType", confType);
		}
	}

	@Override
	public Class<InvokeOmniSecCheckImmediatelyResponse> getResponseClass() {
		return InvokeOmniSecCheckImmediatelyResponse.class;
	}

}
