/*
 * Licensed to scrutmydocs.org (the "Author") under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Author licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.scrutmydocs.webapp.service.admin.river;

import org.scrutmydocs.webapp.api.settings.rivers.data.BasicRiver;
import org.scrutmydocs.webapp.helpers.AbstractRiverHelper;
import org.scrutmydocs.webapp.helpers.RiverHelper;
import org.springframework.stereotype.Component;

/**
 * River Service Implementation for all Rivers
 * @author PILATO
 *
 */
@Component
public class AdminRiverService extends AdminRiverAbstractService<BasicRiver> {
	private static final long serialVersionUID = 1L;

	@Override
	protected AbstractRiverHelper<BasicRiver> getHelper() {
		return new RiverHelper();
	}

	@Override
	protected BasicRiver buildInstance() {
		return new BasicRiver();
	}

}
