/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools

import kotlinx.metadata.Flag
import kotlinx.metadata.Flags

class ClassVisibility(
    val name: String,
    val flags: Flags?,
    val members: Map<MemberSignature, MemberVisibility>,
    val facadeClassName: String? = null
) {
    val visibility get() = flags
    val isCompanion: Boolean get() = flags != null && Flag.Class.IS_COMPANION_OBJECT(flags)

    var companionVisibilities: ClassVisibility? = null
    val partVisibilities = mutableListOf<ClassVisibility>()
}

fun ClassVisibility.findMember(signature: MemberSignature): MemberVisibility? =
    members[signature] ?: partVisibilities.mapNotNull { it.members[signature] }.firstOrNull()


data class MemberVisibility(val member: MemberSignature, val visibility: Flags?)
data class MemberSignature(val name: String, val desc: String)

private fun isPublic(visibility: Flags?, isPublishedApi: Boolean) =
    visibility == null
            || Flag.IS_PUBLIC(visibility)
            || Flag.IS_PROTECTED(visibility)
            || (isPublishedApi && Flag.IS_INTERNAL(visibility))

fun ClassVisibility.isPublic(isPublishedApi: Boolean) = isPublic(visibility, isPublishedApi)
fun MemberVisibility.isPublic(isPublishedApi: Boolean) = isPublic(visibility, isPublishedApi)




