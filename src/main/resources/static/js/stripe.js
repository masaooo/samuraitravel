const stripe = Stripe('pk_test_51PkNaw09Uk8cNxEBzunX1sQDuScCraOI4pGjDFiWygjGaE0fYjNdDxm6h88QworkhqI7pmfKDI192Qn557qKsuBW00B7QbFLHQ');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});