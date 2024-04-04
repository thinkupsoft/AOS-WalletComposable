package models

/**
 * Created by Martin Zarzar on 26/3/24.
 */
sealed class SDUIComponent {
    enum class Type {
        QUICK_ACTIONS,
        FREQUENT_CONTACTS,
        WALLET_CARDS,
    }

    interface EventHandler {
        fun onClick(action:Action?) {}
    }

    interface KeyValue {
        fun toPair(): Pair<String, String>
    }

    sealed class Action {
        data class Submit(val url: String) : Action()
        data class DeepLink(val value: String) : Action()
    }

    companion object {
        const val ACTION_SUBMIT = "SUBMIT"
        const val ACTION_DEEPLINK = "DEEPLINK"
    }
}


fun List<SDUIComponent>.toRequestBody(): Map<String, String> {
    return this.filterIsInstance<SDUIComponent.KeyValue>().associate { it.toPair() }
}

