package com.example.screenguard

val imageReader = ImageReader.newInstance(640, 480, ImageFormat.YUV_420_888, 2)
cameraManager.openCamera(cameraId, object : CameraDevice.StateCallback() {
    override fun onOpened(camera: CameraDevice) {
        val captureSession = camera.createCaptureSession(
            listOf(imageReader.surface),
            object : CameraCaptureSession.StateCallback() {
                override fun onConfigured(session: CameraCaptureSession) {
                    val captureRequest = camera.createCaptureRequest(CameraDevice.TEMPLATE_PREVIEW).apply {
                        addTarget(imageReader.surface)
                    }
                    session.setRepeatingRequest(captureRequest.build(), null, null)
                }

                override fun onConfigureFailed(session: CameraCaptureSession) {}
            },
            null
        )
    }

    override fun onDisconnected(camera: CameraDevice) {}
    override fun onError(camera: CameraDevice, error: Int) {}
}, null)
