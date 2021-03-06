/*
 * Copyright (c) 2015 The Jupiter Project
 *
 * Licensed under the Apache License, version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jupiter.rpc.flow.control;

/**
 * 服务限流, 限流规则在服务端执行, 这可能会有一点点性能开销.
 *
 * 1. 每个 {@link org.jupiter.rpc.JServer} 都可设置一个App级别的全局限流器;
 * 2. 每个Provide也可以设置更细粒度的Provider级别限流器.
 *
 * jupiter
 * org.jupiter.rpc.flow.control
 *
 * @author jiachun.fjc
 */
public interface FlowController<T> {

    ControlResult flowControl(T t);
}
