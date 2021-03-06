package dmostek.cz.library;

import dmostek.cz.library.libraryapi.AvailableBooksListing;
import dmostek.cz.library.libraryapi.BookDetailApi;
import dmostek.cz.library.libraryapi.HTTPImageDownloader;
import dmostek.cz.library.libraryapi.HtmlAvailableBooksListing;
import dmostek.cz.library.libraryapi.HtmlBookDetailApi;
import dmostek.cz.library.libraryapi.HtmlNewsApi;
import dmostek.cz.library.libraryapi.HtmlSearchApi;
import dmostek.cz.library.libraryapi.ImageDownloader;
import dmostek.cz.library.libraryapi.NewsApi;
import dmostek.cz.library.libraryapi.SearchApi;

/**
 * {@link dmostek.cz.library.ApiFactory} which returns HTML version of api which parses results from HTML pages.
 */
public class HtmlApiFactory implements ApiFactory {

    private static final HtmlBookDetailApi detailApi = new HtmlBookDetailApi();
    private static final HtmlSearchApi searchApi = new HtmlSearchApi();
    private static final HTTPImageDownloader imageDownloaderApi = new HTTPImageDownloader();
    private static final HtmlAvailableBooksListing availableListing = new HtmlAvailableBooksListing();
    private static final HtmlNewsApi newsApi = new HtmlNewsApi();

    @Override
    public BookDetailApi getBookDetailApi() {
        return detailApi;
    }

    @Override
    public SearchApi getSearchApi() {
        return searchApi;
    }

    @Override
    public ImageDownloader getImageDownloader() {
        return imageDownloaderApi;
    }

    @Override
    public AvailableBooksListing getAvailableListing() {
        return availableListing;
    }

    @Override
    public NewsApi getNewsApi() {
        return newsApi;
    }
}
