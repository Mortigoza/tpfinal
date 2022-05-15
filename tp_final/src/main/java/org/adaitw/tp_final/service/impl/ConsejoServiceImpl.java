package org.adaitw.tp_final.service.impl;
/*
import org.adaitw.tp_final.model.entity.ConsejoEntity;
import org.adaitw.tp_final.service.ConsejoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ConsejoServiceImpl implements ConsejoService {
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String sender;

    public String sendSimpleMail(ConsejoEntity consejo)
    {

        try {

            SimpleMailMessage mailMessage
                    = new SimpleMailMessage();

            mailMessage.setFrom(sender);
            mailMessage.setTo(consejo.getRecipient());
            mailMessage.setText(consejo.getMsgBody());
            mailMessage.setSubject(consejo.getSubject());
            mailMessage.

            // Sending the mail
            javaMailSender.send(mailMessage);
            return "Mail Sent Successfully...";
        }

        // Catch block to handle the exceptions
        catch (Exception e) {
            return "Error while Sending Mail";
        }
    }


}
*/