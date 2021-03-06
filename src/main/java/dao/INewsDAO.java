package dao;

import model.NewsModel;

import java.util.List;

public interface INewsDAO extends IGenericDAO<NewsModel> {
    void insertNews(NewsModel model);

    void updateNews(Long id, NewsModel model);

    List<NewsModel> getAll();

    NewsModel findNewsById(Long id);
}
