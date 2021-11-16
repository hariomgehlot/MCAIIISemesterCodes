//EN20CA501053 Hariom Gehlot 


<?php
$to_email = "en20ca01053@medicaps.ac.in";
$subject = "Simple Email Test via PHP";
$body = "Hi, This is test email send by PHP Script";
$headers = "From: sender email";

if (mail($to_email, $subject, $body, $headers)) {   //mail() returns 	Returns the hash value of the address parameter,
                                                    // or FALSE on failure. 
                                                    //Note: Keep in mind that even if the email was accepted for delivery, 
                                                    //it does NOT mean the email is actually sent and received!
    echo "Email successfully sent to $to_email...";
} else {
    echo "Email sending failed...";
}

