/**
 * Copyright 2013 Alex Yanchenko
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.droidparts.inner.ann;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodSpec<AnnType extends Ann<?>> {

	public final Method method;
	public final Class<?>[] paramTypes;

	public final AnnType ann;

	public MethodSpec(Method method, AnnType ann) {
		this.method = method;
		paramTypes = method.getParameterTypes();
		this.ann = ann;
		method.setAccessible(true);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + ", methodName:" + method.getName()
				+ ", methodParamTypes:" + Arrays.toString(paramTypes)
				+ ", ann:" + ann;
	}

}