package com.javarush.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;

public class AdvertisementStorage {

    private final List<Advertisement> videos = new ArrayList<>();


    private AdvertisementStorage() {
        Object someContent = new Object();
        this.add(new Advertisement(someContent, "First Video", 5000, 100, 3 * 60)); // 3 min)
        this.add(new Advertisement(someContent, "Second Video", 100, 10, 15 * 60)); //15 min
        this.add(new Advertisement(someContent, "Third Video", 400, 2, 10 * 60)); //10 min
    }

    public static AdvertisementStorage getInstance() {
        return AdvertisementStorageHolder.instance;
    }

    /**
     * Возвращает список всех существующих доступных видео.
     *
     * @return
     */
    public List<Advertisement> list() {
        return this.videos;
    }

    public void add(Advertisement advertisement) {
        this.videos.add(advertisement);
    }

    private static class AdvertisementStorageHolder {
        private final static AdvertisementStorage instance = new AdvertisementStorage();
    }
}
