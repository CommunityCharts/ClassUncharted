package stupidrepo.classuncharted.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Receiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (Intent.ACTION_BOOT_COMPLETED == intent.action) {
            val serviceIntent = Intent(context, NotificationService::class.java)
            context.startForegroundService(serviceIntent)
        }
    }
}