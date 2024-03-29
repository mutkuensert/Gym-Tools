package com.mutkuensert.gymtools.feature.base

import com.mutkuensert.gymtools.feature.bodymeasurements.navigation.ROUTE_MEASUREMENT
import com.mutkuensert.gymtools.feature.onerm.ROUTE_ONE_RM
import com.mutkuensert.gymtools.feature.warmupsets.ROUTE_WARMUP_SETS
import com.mutkuensert.gymtools.resources.TextResKeys

sealed class Tabs(val route: String, val titleKey: String) {
    object WarmupSets : Tabs(route = ROUTE_WARMUP_SETS, titleKey = TextResKeys.WARMUP_SETS)
    object OneRm : Tabs(route = ROUTE_ONE_RM, titleKey = TextResKeys.ONE_RM)
    object BodyMeasurements :
        Tabs(route = ROUTE_MEASUREMENT, titleKey = TextResKeys.BODY_MEASUREMENTS)
}