/*
 * SweetDependency - An easy autowire and manage dependencies Gradle plugin
 * Copyright (C) 2019-2023 HighCapable
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
 * This file is Created by fankes on 2023/6/25.
 */
@file:Suppress("unused", "UnusedReceiverParameter")

package org.gradle.kotlin.dsl

import com.highcapable.sweetdependency.manager.helper.DependencyDeployHelper
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec
import org.jetbrains.kotlin.gradle.plugin.KotlinDependencyHandler

/**
 * 自动装配插件依赖
 * @param params 参数数组
 * @return [PluginDependencySpec]
 */
fun PluginDependenciesSpec.autowire(vararg params: Any) = DependencyDeployHelper.resolveAutowire(spec = this, params)

/**
 * 自动装配依赖
 * @param params 参数数组
 * @return [Any]
 */
fun DependencyHandler.autowire(vararg params: String) = DependencyDeployHelper.resolveAutowire(params = params)

/**
 * 自动装配依赖
 * @param params 参数数组
 * @return [Any]
 */
fun KotlinDependencyHandler.autowire(vararg params: String) = DependencyDeployHelper.resolveAutowire(project, params)