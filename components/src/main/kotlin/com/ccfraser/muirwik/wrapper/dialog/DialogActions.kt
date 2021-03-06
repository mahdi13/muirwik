package com.ccfraser.muirwik.wrapper.dialog

import com.ccfraser.muirwik.wrapper.createStyled
import com.ccfraser.muirwik.wrapper.setStyledPropsAndRunHandler
import react.RBuilder
import react.RComponent
import react.RState
import styled.StyledHandler
import styled.StyledProps


@JsModule("@material-ui/core/DialogActions")
private external val dialogActionsModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val dialogActionsComponent: RComponent<MDialogActionsProps, RState> = dialogActionsModule.default

interface MDialogActionsProps : StyledProps {
    var disableActionSpacing: Boolean
}

fun RBuilder.mDialogActions(
        disableActionSpacing: Boolean = false,

        className: String? = null,
        handler: StyledHandler<MDialogActionsProps>) = createStyled(dialogActionsComponent) {
    attrs.disableActionSpacing = disableActionSpacing

    setStyledPropsAndRunHandler(className, handler)
}



