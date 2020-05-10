package com.aws.sqs.aws.service;

import com.amazonaws.services.sqs.model.SendMessageResult;
import com.aws.sqs.aws.client.AwsSqsClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AwsSqsMessagePublisherService {

    private Integer i = Integer.valueOf(1);
    private final AwsSqsClient awsSqsClient;

    @Scheduled(fixedRate = 1000)
    private void sendMessage(){
        SendMessageResult result = awsSqsClient.getBasicSqsClient().sendMessage(awsSqsClient.getAwsSqsUrl(),"Hello World " + i);
        log.info("Published Message {}",result.getMessageId());
        i++;
    }

}
