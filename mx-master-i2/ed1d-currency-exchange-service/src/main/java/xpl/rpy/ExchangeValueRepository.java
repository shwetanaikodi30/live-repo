package xpl.rpy;
import org.springframework.data.jpa.repository.JpaRepository;
import xpl.ety.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
   ExchangeValue findByFromAndTo(String from, String to);
}
