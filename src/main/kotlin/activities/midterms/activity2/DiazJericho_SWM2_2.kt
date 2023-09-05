package activities.midterms.activity2

interface MessageService {
    fun sendMessage(message: String, recipient: String)
    fun receiveMessage(message: String, sender: String)
}

class Email : MessageService {
    override fun sendMessage(message: String, recipient: String) {
        println("Sending an email to $recipient: $message")
    }

    override fun receiveMessage(message: String, sender: String) {
        println("Receiving an email from $sender: $message")
    }
}

class SMS : MessageService {
    override fun sendMessage(message: String, recipient: String) {
        println("Sending an SMS to $recipient: $message")
    }

    override fun receiveMessage(message: String, sender: String) {
        println("Receiving an SMS from $sender: $message")
    }
}

class MessageSender(private val messageService: MessageService) {
    fun send(message: String, recipient: String) {
        messageService.sendMessage(message, recipient)
    }

    fun receive(message: String, sender: String) {
        messageService.receiveMessage(message, sender)
    }
}

fun main() {
    val email = MessageSender(Email())
    val sms = MessageSender(SMS())

    email.send("Hello, open your gate.", "chupaghetti.salsalani@gmail.com")
    sms.send("Hello, open your gate. Check your email also - jerjerking", "+63912345678")

    println()

    email.receive("Sorry, I fell asleep.", "hammyhotdogdancer@gmail.com")
    sms.receive("Sorry, I fell asleep. I'll check your emails from now on. - hammy", "+63969696969")
}
