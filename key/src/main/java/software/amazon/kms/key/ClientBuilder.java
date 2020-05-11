package software.amazon.kms.key;

import software.amazon.awssdk.services.kms.KmsClient;
import software.amazon.cloudformation.LambdaWrapper;

public class ClientBuilder {
    public static KmsClient getClient() {
        return KmsClient.builder()
            .httpClient(LambdaWrapper.HTTP_CLIENT)
            .build();
    }
}
