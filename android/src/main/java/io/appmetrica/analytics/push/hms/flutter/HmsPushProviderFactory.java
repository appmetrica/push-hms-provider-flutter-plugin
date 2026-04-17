package io.appmetrica.analytics.push.hms.flutter;

import android.app.Application;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.push.flutter.PushProviderFactory;
import io.appmetrica.analytics.push.provider.api.PushServiceControllerProvider;
import io.appmetrica.analytics.push.provider.hms.HmsPushServiceControllerProvider;

public class HmsPushProviderFactory implements PushProviderFactory {

    @NonNull
    @Override
    public PushServiceControllerProvider create(Application application) {
        return new HmsPushServiceControllerProvider(application);
    }
}
