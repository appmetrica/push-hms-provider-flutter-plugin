import 'package:appmetrica_push_hms_provider_plugin/src/hms_push_provider.dart';
import 'package:flutter_test/flutter_test.dart';

void main() {
  test('HmsPushProvider.nativeFactoryClass', () {
    expect(
      HmsPushProvider().nativeFactoryClass,
      'io.appmetrica.analytics.push.hms.flutter.HmsPushProviderFactory',
    );
  });
}
