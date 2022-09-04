package sol.one.service;

import java.util.List;

import org.springframework.stereotype.Service;

import sol.one.VO.BoardVO;
import sol.one.VO.CommentVO;
import sol.one.VO.LikeVO;
import sol.one.VO.ReportVO;
import sol.one.VO.TradeVO;
import sol.one.VO.UserVO;

@Service
public interface MypageService {
	
	//�׽�Ʈ�� �α���
	public UserVO login(UserVO user)throws Exception;
	
	//���������� �� ���� ��ȸ�ϱ�
	public UserVO list_user_mypage(int user_id) throws Exception;
	
	//���������� �� ���� �����ϱ�
	public void update_info_mypage(UserVO user) throws Exception;
	
	//ȸ�� Ż��
	public void delete_info_mypage(UserVO user)throws Exception;
	
	//���������� �� ���ɻ�ǰ ��ȸ�ϱ�
	public LikeVO list_like_mypage(int user_id) throws Exception;
	
	//���������� �� �ŷ����� ��ȸ�ϱ�
	public TradeVO list_trade_mypage(int user_id) throws Exception;
	

	public BoardVO list_board_mypage(int user_id) throws Exception;
	
	//���������� �� ��� ��ȸ�ϱ�
	public CommentVO list_comment_mypage(int user_id)throws Exception;
	
	//���������� �� �Ű� ��ȸ�ϱ�
	public ReportVO list_report_mypage(int user_id)throws Exception;
	
	//���������� �� ���� ���� �� ������ ���� ��й�ȣ üũ
	public int check_password_mypage(UserVO user)throws Exception;
}
