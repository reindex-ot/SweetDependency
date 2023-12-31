/*
 * SweetDependency - An easy autowire and manage dependencies Gradle plugin.
 * Copyright (C) 2019-2024 HighCapable
 * https://github.com/HighCapable/SweetDependency
 *
 * Apache License Version 2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This file is created by fankes on 2023/8/17.
 */
package com.highcapable.sweetdependency.gradle.wrapper

import org.gradle.api.Plugin

/**
 * 插件依赖包装实例实现类
 * @param instance 当前实例
 * @param id 插件 ID
 */
internal data class PluginDependencyWrapper internal constructor(private val instance: Plugin<*>, internal val id: String) {

    override fun toString() = id
}