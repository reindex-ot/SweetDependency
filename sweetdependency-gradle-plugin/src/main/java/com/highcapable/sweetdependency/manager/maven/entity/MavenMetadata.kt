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
 * This file is Created by fankes on 2023/6/6.
 */
package com.highcapable.sweetdependency.manager.maven.entity

import com.highcapable.sweetdependency.gradle.entity.DependencyVersion

/**
 * Maven Metadata 实体
 * @param versions 版本数组
 * @param lastUpdated 最后更新时间戳
 */
internal data class MavenMetadata(
    internal var versions: MutableList<DependencyVersion> = mutableListOf(),
    internal var lastUpdated: Long = 0L
)