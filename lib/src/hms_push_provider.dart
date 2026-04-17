import 'package:appmetrica_push_plugin/appmetrica_push_plugin.dart';

class HmsPushProvider extends PushProvider {
  @override
  String get nativeFactoryClass => "io.appmetrica.analytics.push.hms.flutter.HmsPushProviderFactory";
}
