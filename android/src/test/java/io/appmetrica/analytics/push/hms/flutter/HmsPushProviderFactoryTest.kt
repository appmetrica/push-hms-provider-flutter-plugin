package io.appmetrica.analytics.push.hms.flutter

import android.app.Application
import org.assertj.core.api.Assertions.assertThat
import io.appmetrica.analytics.push.provider.hms.HmsPushServiceControllerProvider
import org.junit.Test
import org.mockito.Mockito.mock

class HmsPushProviderFactoryTest {

    @Test
    fun `create returns HmsPushServiceControllerProvider`() {
        val provider = HmsPushProviderFactory().create(mock(Application::class.java))
        assertThat(provider).isInstanceOf(HmsPushServiceControllerProvider::class.java)
    }
}
