# PayPalAdapter
class StripePayment:
    def pay(self, amount):
        print(f"Pagamento de {amount} via Stripe processado.")

class PaypalPayment:
    def send_payment(self, amount):
        print(f"Pagamento de {amount} via PayPal processado.")

# Adapter para adaptar a interface do Paypal ao Stripe
class PaypalAdapter(StripePayment):
    def __init__(self, paypal_payment):
        self.paypal_payment = paypal_payment

    def pay(self, amount):
        self.paypal_payment.send_payment(amount)

# Uso
def process_payment(payment_system, amount):
    payment_system.pay(amount)

# Exemplo de uso
stripe_payment = StripePayment()
paypal_payment = PaypalAdapter(PaypalPayment())

process_payment(stripe_payment, 100)
process_payment(paypal_payment, 200)
