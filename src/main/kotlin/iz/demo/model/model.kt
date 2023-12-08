package iz.demo.model

data class Message(val payload: Payload, val timeStamp: Long)

data class Payload(val key: String, val value: String)