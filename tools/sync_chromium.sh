#!/bin/bash

set -e

PRO_DIR="$(pwd)/Chromium"
BASE_DIR="/home/chromium/chromium/src"
RELEASE_DIR="${BASE_DIR}/out/Debug"
APP_DIR="${PRO_DIR}/app"
MODULES_DIR="${PRO_DIR}"

sync_ui() {
	mkdir -p ${MODULES_DIR}/ui/src/main/res

	cp -r ${BASE_DIR}/ui/android/java/src/* \
		"${APP_DIR}/src/main/java"

	cp -r ${BASE_DIR}/ui/android/java/res/* \
		${RELEASE_DIR}/gen/ui/android/ui_strings_grd_grit_output/* \
		"${MODULES_DIR}/ui/src/main/res"
}

sync_components() {
	mkdir -p ${MODULES_DIR}/components/{autofill,components_base,embedder_support}/src/main/res
	mkdir -p ${MODULES_DIR}/components/browser_ui/style_res
	mkdir -p ${MODULES_DIR}/components/browser_ui/src/main/res/values
	mkdir -p ${MODULES_DIR}/components/browser_ui/widget_res

	local components="${BASE_DIR}/components"
	cp -r ${components}/autofill/android/java/src/* \
		${components}/background_task_scheduler/android/java/src/* \
		${components}/bookmarks/common/android/java/src/* \
		${components}/crash/android/java/src/* \
		${components}/dom_distiller/content/browser/android/java/src/* \
		${components}/dom_distiller/core/android/java/src/* \
		${components}/download/internal/background_service/android/java/src/* \
		${components}/download/network/android/java/src/* \
		${components}/embedder_support/android/java/src/* \
		${components}/feature_engagement/internal/android/java/src/* \
		${components}/feature_engagement/public/android/java/src/* \
		${components}/gcm_driver/android/java/src/* \
		${components}/gcm_driver/instance_id/android/java/src/* \
		${components}/invalidation/impl/android/java/src/* \
		${components}/language/android/java/src/* \
		${components}/location/android/java/src/* \
		${components}/minidump_uploader/android/java/src/* \
		${components}/module_installer/android/java/src/* \
		${components}/navigation_interception/android/java/src/* \
		${components}/offline_items_collection/core/android/java/src/* \
		${components}/omnibox/browser/android/java/src/* \
		${components}/payments/content/android/java/src/* \
		${components}/policy/android/java/src/* \
		${components}/safe_browsing/android/java/src/* \
		${components}/signin/core/browser/android/java/src/* \
		${components}/spellcheck/browser/android/java/src/* \
		${components}/sync/android/java/src/* \
		${components}/url_formatter/android/java/src/* \
		${components}/variations/android/java/src/* \
		${components}/version_info/android/java/src/* \
		${components}/viz/service/java/src/* \
		${components}/browser_ui/styles/android/java/src/* \
		${components}/browser_ui/widget/android/java/src/* \
		"${APP_DIR}/src/main/java"

	cp -r ${RELEASE_DIR}/gen/components/version_info/android/java/* \
		"${APP_DIR}/src/main/java"

	cp -r ${components}/autofill/android/java/res/* \
		${RELEASE_DIR}/gen/components/autofill/android/autofill_strings_grd_grit_output/* \
		"${MODULES_DIR}/components/autofill/src/main/res"

	cp -r ${components}/embedder_support/android/java/res/* \
		${RELEASE_DIR}/gen/components/embedder_support/android/web_contents_delegate_strings_grd_grit_output/* \
		"${MODULES_DIR}/components/embedder_support/src/main/res"

	cp -r ${RELEASE_DIR}/gen/components/strings/java/res/* \
		"${MODULES_DIR}/components/components_base/src/main/res"

	cp -r ${components}/browser_ui/styles/android/java/res/* \
		${components}/browser_ui/styles/android/java/res-night/* \
                "${MODULES_DIR}/components/browser_ui/style_res/"

	cp -r ${components}/browser_ui/widget/android/java/res/* \
		${components}/browser_ui/widget/android/java/res-night/* \
                "${MODULES_DIR}/components/browser_ui/widget_res/"

	cp -r ${RELEASE_DIR}/gen/components/browser_ui/strings/android/browser_ui_strings_grd_grit_output/values/* \
	"${MODULES_DIR}/components/browser_ui/src/main/res/"

}

sync_content() {
	mkdir -p ${MODULES_DIR}/content/src/main/res

	cp -r ${BASE_DIR}/content/public/android/java/src/* \
		"${APP_DIR}/src/main/java"

	cp -r ${BASE_DIR}/content/public/android/java/res/* \
		${RELEASE_DIR}/gen/content/public/android/content_strings_grd_grit_output/* \
		"${MODULES_DIR}/content/src/main/res"

	# local aidl_i="${APP_DIR}/src/main/aidl/org/chromium"
	# mkdir -p "$aidl_i"
	#
	# mv ${APP_DIR}/src/main/java/org/chromium/*.aidl "$aidl_i"
	#
	# local aidl_j="${APP_DIR}/src/main/aidl/org/chromium/content/common"
	# mkdir -p "$aidl_j"
	#
	# mv ${APP_DIR}/src/main/java/org/chromium/content/common/*.aidl "$aidl_j"

	# find ${APP_DIR}/src/main/java/org/chromium -name "*.aidl" -type f -print0 | xargs -0 rm -f
}

sync_data_chart() {
	mkdir -p ${MODULES_DIR}/data_chart/src/main/{java,res}

	cp -r ${BASE_DIR}/third_party/android_data_chart/java/src/* \
		"${MODULES_DIR}/data_chart/src/main/java"

	cp -r ${BASE_DIR}/third_party/android_data_chart/java/res/* \
		"${MODULES_DIR}/data_chart/src/main/res"
}

sync_media() {
	mkdir -p ${MODULES_DIR}/media/src/main/{java,res}

	cp -r ${BASE_DIR}/third_party/android_media/java/src/* \
		"${MODULES_DIR}/media/src/main/java"
	cp -r ${BASE_DIR}/third_party/android_media/java/res/* \
		${BASE_DIR}/media/base/android/java/res/* \
		"${MODULES_DIR}/media/src/main/res"
}

sync_download() {
        mkdir -p ${MODULES_DIR}/download/src/main/res

	cp -r ${BASE_DIR}/chrome/android/java/res_download/* \
		"${MODULES_DIR}/download/src/main/res"
}

sync_autofill_assistant() {
	mkdir -p ${MODULES_DIR}/autofill_assistant/src/main/res/values

	cp -r ${BASE_DIR}/chrome/android/features/autofill_assistant/java/res/* \
		"${MODULES_DIR}/autofill_assistant/src/main/res"

	cp -r ${RELEASE_DIR}/gen/chrome/android/features/autofill_assistant/java_strings_grd_grit_output/values/* \
		"${MODULES_DIR}/autofill_assistant/src/main/res/values"
}

sync_customtabs() {
	mkdir -p ${MODULES_DIR}/customtabs/src/main/res

	cp -r ${BASE_DIR}/third_party/custom_tabs_client/src/customtabs/src/* \
		"${APP_DIR}/src/main/java"

	cp -r ${BASE_DIR}/third_party/custom_tabs_client/src/customtabs/res/* \
		"${MODULES_DIR}/customtabs/src/main/res"
}

sync_splash() {
       mkdir -p ${MODULES_DIR}/splash/src/main/res

       cp -r ${BASE_DIR}/chrome/android/webapk/libs/common/res_splash/* \
	       "${MODULES_DIR}/splash/src/main/res"
}

sync_feed() {
	mkdir -p ${MODULES_DIR}/feed/{basic_res,piet_res}

	cp -r ${BASE_DIR}/chrome/android/feed/core/java/res/* \
	"${MODULES_DIR}/feed/basic_res"

	cp -r ${BASE_DIR}/chrome/android/feed/core/java/src/org/chromium/chrome/browser/feed/library/piet/res/* \
	"${MODULES_DIR}/feed/piet_res"
}

sync_aidl() {
        local custom_tabs_aidl="${APP_DIR}/src/main/aidl/android/support/customtabs"
        mkdir -p "$custom_tabs_aidl"
        mv -f ${APP_DIR}/src/main/java/android/support/customtabs/*.aidl \
		"$custom_tabs_aidl"

        local custom_tabs_trusted_aidl="${APP_DIR}/src/main/aidl/android/support/customtabs/trusted"
        mkdir -p "$custom_tabs_trusted_aidl"
        mv -f ${APP_DIR}/src/main/java/android/support/customtabs/trusted/*.aidl \
                "$custom_tabs_trusted_aidl"
}

sync_chrome() {
	mkdir -p ${APP_DIR}/{src/main/{java,res,aidl},libs,settings_res,strings_res/values, ui_res}
	local src_dir="${APP_DIR}/src/main/java"
	local res_dir="${APP_DIR}/src/main/res"

	cp -r ${BASE_DIR}/base/android/java/src/* \
		${BASE_DIR}/build/android/buildhooks/java/* \
		${BASE_DIR}/chrome/android/feed/core/java/src/* \
		${BASE_DIR}/chrome/android/java/src/* \
		${BASE_DIR}/chrome/android/third_party/compositor_animator/java/src/* \
		${BASE_DIR}/chrome/android/webapk/libs/client/src/* \
		${BASE_DIR}/chrome/android/webapk/libs/common/src/* \
		${BASE_DIR}/chrome/browser/settings/android/java/src/* \
		${BASE_DIR}/chrome/browser/settings/android/widget/java/src/* \
		${BASE_DIR}/device/bluetooth/android/java/src/* \
		${BASE_DIR}/device/gamepad/android/java/src/* \
		${BASE_DIR}/services/device/usb/android/java/src/* \
		${BASE_DIR}/device/vr/android/java/src/* \
		${BASE_DIR}/media/base/android/java/src/* \
		${BASE_DIR}/media/capture/content/android/java/src/* \
		${BASE_DIR}/media/capture/video/android/java/src/* \
		${BASE_DIR}/media/midi/java/src/* \
		${BASE_DIR}/mojo/public/java/base/src/* \
		${BASE_DIR}/mojo/public/java/bindings/src/* \
		${BASE_DIR}/mojo/public/java/system/src/* \
		${BASE_DIR}/net/android/java/src/* \
		${BASE_DIR}/printing/android/java/src/* \
		${BASE_DIR}/services/data_decoder/public/cpp/android/java/src/* \
		${BASE_DIR}/services/device/android/java/src/* \
		${BASE_DIR}/services/device/battery/android/java/src/* \
		${BASE_DIR}/services/device/generic_sensor/android/java/src/* \
		${BASE_DIR}/services/device/geolocation/android/java/src/* \
		${BASE_DIR}/services/device/nfc/android/java/src/* \
		${BASE_DIR}/services/device/public/java/src/* \
		${BASE_DIR}/services/device/screen_orientation/android/java/src/* \
		${BASE_DIR}/services/device/time_zone_monitor/android/java/src/* \
		${BASE_DIR}/services/device/vibration/android/java/src/* \
		${BASE_DIR}/services/device/wake_lock/power_save_blocker/android/java/src/* \
		${BASE_DIR}/services/media_session/public/cpp/android/java/src/* \
		${BASE_DIR}/services/service_manager/public/java/src/* \
		${BASE_DIR}/services/shape_detection/android/java/src/* \
		${BASE_DIR}/third_party/android_protobuf/src/java/src/device/main/java/* \
		${BASE_DIR}/third_party/android_protobuf/src/java/src/main/java/* \
		${BASE_DIR}/third_party/android_swipe_refresh/java/src/* \
		${BASE_DIR}/third_party/cct_dynamic_module/src/src/java/* \
		${BASE_DIR}/third_party/cacheinvalidation/src/java/* \
		${BASE_DIR}/third_party/gif_player/src/* \
		${BASE_DIR}/third_party/protobuf/java/core/src/main/java/* \
		${BASE_DIR}/third_party/android_sdk/public/extras/chromium/support/src/* \
		${BASE_DIR}/third_party/robolectric/custom_asynctask/java/src/* \
		${BASE_DIR}/chrome/browser/util/android/java/src/* \
		${BASE_DIR}/chrome/browser/preferences/android/java/src/* \
		${BASE_DIR}/chrome/browser/flags/android/java/src/* \
		${BASE_DIR}/chrome/android/features/vr/java/src/* \
		${BASE_DIR}/components/find_in_page/android/java/src/* \
		${BASE_DIR}/chrome/browser/ui/android/native_page/java/src/* \
		${BASE_DIR}/chrome/android/public/crypto/java/src/* \
		${BASE_DIR}/chrome/android/public/profiles/java/src/* \
		${BASE_DIR}/url/android/java/src/* \
		${BASE_DIR}/chrome/android/features/autofill_assistant/public/java/src/* \
		${BASE_DIR}/chrome/android/features/keyboard_accessory/public/java/src/* \
		${BASE_DIR}/chrome/android/features/keyboard_accessory/factory/java/src/* \
		${BASE_DIR}/components/browser_ui/modaldialog/android/java/src/* \
		${BASE_DIR}/chrome/lib/lifecycle/public/android/java/src/* \
		${BASE_DIR}/components/content_capture/android/java/src/* \
		${BASE_DIR}/components/paint_preview/browser/android/java/src/* \
		${BASE_DIR}/components/search_engines/android/java/src/* \
		${BASE_DIR}/chrome/android/features/start_surface/public/java/src/* \
		${BASE_DIR}/chrome/browser/android/thin_webview/java/src/* \
		${BASE_DIR}/third_party/android_sdk/androidx_browser/src/browser/src/main/java/* \
		${BASE_DIR}/chrome/browser/thumbnail/generator/android/java/src/* \
		${BASE_DIR}/chrome/browser/image_fetcher/android/java/src/* \
		${BASE_DIR}/chrome/browser/download/android/java/src/* \
		${BASE_DIR}/components/download/internal/common/android/java/src/* \
		${BASE_DIR}/components/app_modal/android/java/src/* \
		${BASE_DIR}/components/viz/common/java/src/* \
		${BASE_DIR}/base/test/android/javatests/src/* \
		${BASE_DIR}/chrome/test/android/javatests/src/* \
		${BASE_DIR}/ui/android/javatests/src/* \
		${BASE_DIR}/content/public/test/android/javatests/src/* \
		${BASE_DIR}/chrome/browser/share/android/java/src/* \
		${BASE_DIR}/chrome/android/features/start_surface/internal/java/src/* \
		${BASE_DIR}/chrome/browser/notifications/chime/android/java/src/* \
		${BASE_DIR}/chrome/android/webapk/shell_apk/src/* \
		${BASE_DIR}/net/test/android/javatests/src/* \
		${BASE_DIR}/chrome/browser/image_editor/public/android/java/src/* \
		${BASE_DIR}/android/modules/image_editor/provider/java/src/* \
		${BASE_DIR}/android/modules/image_editor/public/java/src/* \
		${BASE_DIR}/base/test/android/junit/src/* \
		${BASE_DIR}/chrome/browser/ui/android/appmenu/test/java/src/* \
		${BASE_DIR}/components/signin/core/browser/android/javatests/src/* \
		${BASE_DIR}/components/signin/core/browser/android/javatests/src/* \
		${BASE_DIR}/testing/android/junit/java/src/* \
		${BASE_DIR}/chrome/browser/android/thin_webview/internal/java/src/* \
		${BASE_DIR}/chrome/android/modules/chime/public/java/src/* \
		${BASE_DIR}/components/policy/android/javatests/src/* \
	"$src_dir"

	cp -r ${RELEASE_DIR}/gen/third_party/cacheinvalidation/cacheinvalidation_proto_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/chrome/android/chrome_android_java_switches/generated_java/input_srcjars* \
        ${RELEASE_DIR}/gen/third_party/blink/public/mojom/mojom_platform_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/feature_engagement/public/public_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/contextual_search/content/common/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/chrome/browser/preferences/java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/chrome/android/update_proto_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/third_party/blink/public/blink_headers_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/url/mojom/url_mojom_origin_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/service_manager/public/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/mojo/public/java/bindings_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/sync/android/sync_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/build/android/buildhooks/build_hooks_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/url_formatter/android/url_formatter_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/mojo/public/mojom/base/base_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/bookmarks/common/android/bookmarks_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/signin/public/android/java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/ui/base/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/chrome/android/webapk/libs/client/client_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/crash/android/java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/offline_items_collection/core/core_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/chrome/browser/image_fetcher/java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/third_party/cct_dynamic_module/cct_dynamic_module_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/omnibox/browser/browser_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/third_party/blink/public/mojom/android_mojo_bindings_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/feed/core/proto/proto_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/net/android/net_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/download/public/common/public_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/chrome/android/usage_stats_proto_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/download/public/task/public_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/url/mojom/url_mojom_gurl_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/payments/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/sync/protocol/protocol_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/chrome/android/partner_location_descriptor_proto_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/version_info/android/version_constants_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/media_session/public/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/network/public/mojom/data_pipe_interfaces_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/chrome/android/webapk/libs/common/common_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/chrome/browser/thumbnail/generator/proto_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/out/Debug/gen/chrome/android/modules/chime/public/java/generated_java/annotation_processor_outputs/* \
        ${RELEASE_DIR}/gen/third_party/blink/public/mojom/mojom_core_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/ui/gfx/geometry/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/device/public/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/media/mojo/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/skia/public/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_network_isolation_key_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/network/public/mojom/mutable_network_traffic_annotation_interface_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/ui/gfx/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/media/learning/mojo/public/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/gpu/ipc/common/interfaces_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/viz/public/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/network/public/mojom/websocket_mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/services/filesystem/public/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/media/capture/mojom/video_capture_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/proxy_resolver/public/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/network/public/mojom/mojom_ip_address_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/invalidation/impl/proto_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/shape_detection/public/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/content_settings/core/common/mojo_bindings_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/dom_distiller/core/android/dom_distiller_core_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/ui/latency/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/ui/display/mojom/mojom_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/media/capture/video/android/capture_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/location/android/location_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/gpu/ipc/common/vulkan_interface_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/services/device/public/mojom/generic_sensor_java/generated_java/input_srcjars/* \
        ${RELEASE_DIR}/gen/components/background_task_scheduler/scheduled_task_java/generated_java/input_srcjars/* \
       "$src_dir"

	cp -r ${RELEASE_DIR}/gen/chrome/android/templates/org/* \
	  ${RELEASE_DIR}/gen/content/public/android/content_java/generated_java/input_srcjars/org/* \
	  ${RELEASE_DIR}/gen/ui/android/ui_full_java/generated_java/input_srcjars/org/* \
	  ${RELEASE_DIR}/gen/components/autofill/android/autofill_java/generated_java/input_srcjars/org/* \
	  ${RELEASE_DIR}/gen/components/gcm_driver/instance_id/android/instance_id_driver_java/generated_java/input_srcjars/org/* \
	  ${RELEASE_DIR}/gen/media/base/android/media_java/generated_java/input_srcjars/org/* \
	  ${RELEASE_DIR}/gen/components/signin/public/android/java/generated_java/annotation_processor_outputs/org/* \
		"$src_dir/org"

	cp -r ${RELEASE_DIR}/gen/chrome/browser/util/java/generated_java/annotation_processor_outputs/org/* \
	  ${RELEASE_DIR}/gen/ui/android/ui_full_java/generated_java/annotation_processor_outputs/org/* \
	  ${RELEASE_DIR}/gen/content/public/android/content_java/generated_java/annotation_processor_outputs/org/* \
	  ${RELEASE_DIR}/gen/components/search_engines/android/java/generated_java/annotation_processor_outputs/org/* \
	  ${RELEASE_DIR}/gen/net/android/net_java/generated_java/annotation_processor_outputs/org/* \
	  "$src_dir/annotation_processor_outputs/org"

	mkdir -p ${PRO_DIR}/res_base

	cp -r ${BASE_DIR}/chrome/android/java/res/* \
	       "${PRO_DIR}/res_base"

	cp -r  ${BASE_DIR}/chrome/android/java/res_chromium/* \
		"$res_dir"

	cp -r ${BASE_DIR}/chrome/android/java/res_vr/* "$res_dir"

	cp -r ${RELEASE_DIR}/gen/chrome/java/res/* \
		${RELEASE_DIR}/gen/chrome/android/templates/chrome_version_xml/res/* \
		${RELEASE_DIR}/gradle/chrome/android/chrome_public_apk/extracted-res/xml \
		"$res_dir"

	cp "${RELEASE_DIR}/gen/chrome/android/chrome_public_apk/AndroidManifest.xml" \
		"${APP_DIR}/src/main"

	cp -r ${RELEASE_DIR}/gen/chrome/app/policy/android/* \
		"$res_dir"

	cp -r \
		${RELEASE_DIR}/gen/chrome/android/chrome_java/generated_java/* \
		${RELEASE_DIR}/gen/base/base_build_config_gen/java_cpp_template/* \
		${RELEASE_DIR}/gen/net/android/net_errors_java/java_cpp_template/* \
		${RELEASE_DIR}/gen/base/base_java/generated_java/* \
		"$src_dir"
	
	cp -r ${BASE_DIR}/chrome/browser/settings/android/java/res/* \
		"${APP_DIR}/settings_res/"

	cp -r ${RELEASE_DIR}/gen/chrome/browser/ui/android/strings/ui_strings_grd_grit_output/values/* \
		"${APP_DIR}/strings_res/values/"

	cp -r ${BASE_DIR}/chrome/browser/ui/messages/android/java/src/* \
	      ${BASE_DIR}/chrome/browser/ui/android/appmenu/java/src/* \
		"${APP_DIR}/src/main/java/"

  cp -r ${BASE_DIR}/chrome/browser/ui/messages/android/java/res/* \
        ${BASE_DIR}/chrome/browser/ui/android/appmenu/java/res/* \
    "${APP_DIR}/ui_res/"
}

sync_assets() {
	local asset_dir="${APP_DIR}/src/main/assets"
	mkdir -p "$asset_dir"
	mkdir -p "${asset_dir}/locales"

	cp ${RELEASE_DIR}/*.dat \
		${RELEASE_DIR}/gen/chrome/android/chrome_apk_paks/*.pak \
		"$asset_dir"

	cp ${RELEASE_DIR}/gen/chrome/android/chrome_apk_paks/locales/{en-US,zh-CN,zh-TW}.pak \
		"${asset_dir}/locales"
	cp ${RELEASE_DIR}/snapshot_blob.bin "$asset_dir"/snapshot_blob_32.bin
}

sync_libs() {
	mkdir -p "${APP_DIR}/libs"

	cp ${BASE_DIR}/third_party/google_android_play_core/*.aar \
		${RELEASE_DIR}/lib.java/third_party/android_sdk/gcm.jar \
		"${APP_DIR}/libs"
}

sync_jniLibs() {
	local jni_libs_dir="${APP_DIR}/src/main/jniLibs/armeabi-v7a"
	mkdir -p "$jni_libs_dir"
	cp ${RELEASE_DIR}/*.so "$jni_libs_dir"
}

clean_project() {
	rm -rf ${APP_DIR}/src/main/java/org/org \
		${APP_DIR}/src/main/java/org/src \
		${APP_DIR}/src/main/java/org/com \
		${APP_DIR}/src/main/java/com/google/protobuf \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/MonochromeApplication.java \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/preferences/password/PasswordEntryEditorPreference.java \
		${APP_DIR}/src/main/java/org/chromium/components/embedder_support/media \
		${APP_DIR}/src/main/java/org/chromium/chrome/browser/offlinepages/evaluation \
		${APP_DIR}/src/main/java/{src,test,templates}

	local del_files="README|OWNERS|COPYING|BUILD|.*\.template|R\.java|.*\.stamp|.*stamp\.d|.*\.py|.*\.flags"
	find "$PRO_DIR" -regextype "posix-egrep" -regex ".*/(${del_files})" -type f -print0 | \
		xargs -0 rm -f

	local langs="am|ar|bg|ca|cs|da|de|el|en-rGB|es|es-rUS|fa|fi|fr|hi|hr|hu|in|it|iw"
	langs="$langs|ja|ko|lt|lv|nb|nl|pl|pt-rBR|pt-rPT|ro|ru|sk|sl|sr|sv|sw|th|tl|tr|uk|vi"
	find "$PRO_DIR" -regextype "posix-egrep" -regex ".*values-($langs)" -print0 | xargs -0 rm -rf

	find "${PRO_DIR}/res_base" -regextype "posix-egrep" -regex ".*/app_icon\.png" -type f -print0 | xargs -0 rm -f

	local aidls
	aidls=$(find "${APP_DIR}/src/main/aidl" -name "*.aidl" -type f)
	local j_file;
	for aidl in $aidls; do
		j_file="$(basename "$aidl" ".aidl")"
		find "${APP_DIR}/src/main/java" -name "${j_file}.java" -type f -print0 | xargs -0 rm -f
	done

	local empty_dirs;
	while :; do
		empty_dirs="$(find "$PRO_DIR" -type d -empty)"
		if [ -n "$empty_dirs" ]; then
			echo "$empty_dirs" | xargs rm -rf
		else
			break
		fi
	done
}

do_sync() {
	rm -rf "$PRO_DIR"
	sync_chrome
	sync_ui
	sync_media
	sync_data_chart
	sync_components
	sync_content
	sync_customtabs
	sync_download
	sync_splash
	sync_autofill_assistant
	sync_feed
	sync_aidl

	sync_assets
	sync_libs
	sync_jniLibs

	clean_project
	# NativeLibraries
}

do_sync
