package dao.impl;

import dao.INewsDAO;
import mapper.NewsMapper;
import model.NewsModel;

import java.sql.Timestamp;
import java.util.List;

public class INewsDAOImpl extends AbstractDAO<NewsModel> implements INewsDAO {


    public static void main(String[] args) {
        NewsModel model = new NewsModel();
        model.setModifiedBy("Đào Văn Tâm");
        model.setModifiedDate(new Timestamp(System.currentTimeMillis()));
        model.setTitle("Giải U23 Châu Á");
        model.setShortDescription("Việt Nam 4-0 Thái Lan");
        model.setContent("Việt Nam giành quyền vào chung kết");
        model.setCreatedBy("Đào Văn Tâm");
        model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        model.setStatus("PENDING");
        model.setThumnail("U23 Châu Á");
        model.setCategoryId((long) 2);

        INewsDAO newsDAO = new INewsDAOImpl();
//        newsDAO.insertNews(model);
//        newsDAO.updateNews((long) 4,model);
//        System.out.println(newsDAO.findNewsById((long) 3));
        newsDAO.getAll().forEach(System.out::println);
    }

    public void insertNews(NewsModel model) {
        String sql = "INSERT INTO news(title, shortDescription, content, createdBy, createdDate, thumnail, status, categoryID) VALUES (?,?,?,?,?,?,?,?);";
        insert(
                sql, model.getTitle(),
                model.getShortDescription(), model.getContent(),
                model.getCreatedBy(), model.getCreatedDate(), model.getThumnail(),
                model.getStatus(), model.getCategoryId()
        );
    }

    public void updateNews(Long id, NewsModel model) {
        String sql = "UPDATE news.news SET title=?,shortDescription=?,content=?,createdBy=?,createdDate=?,modifiedBy=?,modifiedDate=?,thumnail=?,status=?, categoryID=? WHERE id=?;";
        update(
                sql, model.getTitle(),
                model.getShortDescription(), model.getContent(),
                model.getCreatedBy(), model.getCreatedDate(),
                model.getModifiedBy(), model.getModifiedDate(),
                model.getThumnail(), model.getStatus(),
                model.getCategoryId(), id
        );
    }

    public List<NewsModel> getAll() {
        String sql = "SELECT * FROM news";
        return findByProperties(sql, new NewsMapper());
    }

    public NewsModel findNewsById(Long id) {
        String sql = "SELECT * FROM  news.news WHERE id=?;";
        List<NewsModel> newsModelList = findByProperties(sql, new NewsMapper(), id);
        return newsModelList.isEmpty() ? null : newsModelList.get(0);
    }
}
