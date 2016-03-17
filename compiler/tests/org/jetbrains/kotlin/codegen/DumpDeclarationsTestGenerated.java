/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
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

package org.jetbrains.kotlin.codegen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/dumpDeclarations")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class DumpDeclarationsTestGenerated extends AbstractDumpDeclarationsTest {
    public void testAllFilesPresentInDumpDeclarations() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/dumpDeclarations"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("annotation.kt")
    public void testAnnotation() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/dumpDeclarations/annotation.kt");
        doTest(fileName);
    }

    @TestMetadata("classMembers.kt")
    public void testClassMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/dumpDeclarations/classMembers.kt");
        doTest(fileName);
    }

    @TestMetadata("classes.kt")
    public void testClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/dumpDeclarations/classes.kt");
        doTest(fileName);
    }

    @TestMetadata("interfaces.kt")
    public void testInterfaces() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/dumpDeclarations/interfaces.kt");
        doTest(fileName);
    }

    @TestMetadata("localClasses.kt")
    public void testLocalClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/dumpDeclarations/localClasses.kt");
        doTest(fileName);
    }

    @TestMetadata("multifileFacadeMembers.kt")
    public void testMultifileFacadeMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/dumpDeclarations/multifileFacadeMembers.kt");
        doTest(fileName);
    }

    @TestMetadata("topLevelMembers.kt")
    public void testTopLevelMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/dumpDeclarations/topLevelMembers.kt");
        doTest(fileName);
    }
}
