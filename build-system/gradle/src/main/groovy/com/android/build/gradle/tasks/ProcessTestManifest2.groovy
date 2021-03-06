/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.build.gradle.tasks

import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional

/**
 * A task that processes the manifest
 */
public class ProcessTestManifest2 extends ProcessTestManifest {

    @InputFile
    @Optional
    File testManifestFile

    File tmpDir

    @Override
    protected void doFullTaskAction() {
        migrateProperties()

        getBuilder().processTestManifest2(
                getTestApplicationId(),
                getMinSdkVersion(),
                getTargetSdkVersion(),
                getTestedApplicationId(),
                getInstrumentationRunner(),
                getHandleProfiling(),
                getFunctionalTest(),
                getTestManifestFile(),
                getLibraries(),
                getManifestOutputFile(),
                getTmpDir())
    }
}
