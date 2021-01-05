package com.safe.splanet.tinker

import com.tencent.tinker.loader.app.TinkerApplication
import com.tencent.tinker.loader.shareutil.ShareConstants

class SampleApplication : TinkerApplication(
    ShareConstants.TINKER_ENABLE_ALL, "com.safe.splanet.tinker.SampleApplicationLike",
    "com.tencent.tinker.loader.TinkerLoader", false, true
)