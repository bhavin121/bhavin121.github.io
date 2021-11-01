import { initializeApp } from "https://www.gstatic.com/firebasejs/9.2.0/firebase-app.js";
import { getAnalytics } from "https://www.gstatic.com/firebasejs/9.2.0/firebase-analytics.js";
import { getAuth, createUserWithEmailAndPassword } from "https://www.gstatic.com/firebasejs/9.2.0/firebase-auth.js";
        // TODO: Add SDKs for Firebase products that you want to use
        // https://firebase.google.com/docs/web/setup#available-libraries
      
        // Your web app's Firebase configuration
        // For Firebase JS SDK v7.20.0 and later, measurementId is optional
        const firebaseConfig = {
          apiKey: "AIzaSyDROUj1Mo2mRpAiI_z0Gvb74DGJ3YdpTaE",
          authDomain: "fooder-se.firebaseapp.com",
          projectId: "fooder-se",
          storageBucket: "fooder-se.appspot.com",
          messagingSenderId: "1002239577737",
          appId: "1:1002239577737:web:daa2ec2c6a7507a2b90058",
          measurementId: "G-5VB8D0WLVF"
        };
      
        // Initialize Firebase
        const app = initializeApp(firebaseConfig);
        const analytics = getAnalytics(app);
        const auth = getAuth(app);

        document.getElementById('signUp').addEventListener('click', function(){
            const email = document.getElementById('email').value;
            const password = document.getElementById('pass').value;
            signUp(email, password);
        });

        function signUp(email, password){
                console.log(email);
                createUserWithEmailAndPassword(auth, email, password)
                .then((userCredential) => {
                    // Signed in 
                    var user = userCredential.user;
                    console.log(user);
                    // ...
                })
                .catch((error) => {
                    var errorCode = error.code;
                    var errorMessage = error.message;
                    console.log(errorMessage);
                    // ..
                });
            }