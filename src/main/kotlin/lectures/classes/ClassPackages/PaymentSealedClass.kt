package lectures.classes.ClassPackages

// Sealed class representing different payment methods
sealed class PaymentMethod {
    data class CreditCard(val cardNumber: String) : PaymentMethod()
    data class PayPal(val email: String) : PaymentMethod()
    object Cash : PaymentMethod()
}

// Function to process a payment
fun processPayment(method: PaymentMethod) {
    when (method) {
        is PaymentMethod.CreditCard -> {
            println("Processing credit card payment with card number: ${method.cardNumber}")
        }
        is PaymentMethod.PayPal -> {
            println("Processing PayPal payment with email: ${method.email}")
        }
        is PaymentMethod.Cash -> {
            println("Collecting cash payment")
        }
    }
}