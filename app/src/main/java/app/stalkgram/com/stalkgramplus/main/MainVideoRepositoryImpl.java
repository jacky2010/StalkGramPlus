package app.stalkgram.com.stalkgramplus.main;

import app.stalkgram.com.stalkgramplus.domain.DownloadFileFromURL;
import app.stalkgram.com.stalkgramplus.lib.base.EventBus;
import app.stalkgram.com.stalkgramplus.main.events.MainEvent;

/**
 * Created by elio on 8/5/16.
 */
public class MainVideoRepositoryImpl implements MainRepository {

    private EventBus eventBus;
    public MainVideoRepositoryImpl(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void downloadFile(String username, String videoUrl) {
        DownloadFileFromURL downloadFileFromURL = new DownloadFileFromURL(MainEvent.onDownloadVideo, eventBus);
        downloadFileFromURL.execute(videoUrl);
    }
}