package com.study.neo4j.controller;

import com.study.neo4j.domain.Company;
import com.study.neo4j.domain.Device;
import com.study.neo4j.domain.User;
import com.study.neo4j.relation.Company2UserRelation;
import com.study.neo4j.relation.User2CompanyRelation;
import com.study.neo4j.relation.User2DeviceRelation;
import com.study.neo4j.repository.CommonRepository;
import com.study.neo4j.repository.Company2UserRepository;
import com.study.neo4j.repository.User2CompanyRepository;
import com.study.neo4j.repository.User2DeviceRepository;
import com.study.neo4j.repository.User2FriendRepository;
import com.study.neo4j.service.CompaynService;
import com.study.neo4j.service.DeviceService;
import com.study.neo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private CompaynService compaynService;
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private User2DeviceRepository user2DeviceRepository;
	@Autowired
	private User2CompanyRepository user2CompanyRepository;
	@Autowired
	private Company2UserRepository company2UserRepository;
	@Autowired
	private CommonRepository commonRepository;
	@Autowired
	private User2FriendRepository user2FriendRepository;

	/**
	 * 初始化
	 *
	 * @author Caratacus
	 * @date 2016/10/24 0002
	 * @version 1.0
	 */
	@GetMapping(value = "/init")
	private void init() {

		try {
			commonRepository.clearDatabase();
			// 创建用户节点
			User user = new User();
			user.setBirthday(new GregorianCalendar(1989, 7, 14).getTime());
			user.setName("CX");
			user.setSex("1");
			user.setCreatedTime(new Date());
			user.setMobile("13718868986");
			User user2 = new User();
			user2.setBirthday(new GregorianCalendar(1989, 8, 15).getTime());
			user2.setName("LXF");
			user2.setSex("1");
			user2.setCreatedTime(new Date());
			user2.setMobile("13718868987");
			User user3 = new User();
			user3.setBirthday(new GregorianCalendar(1992, 1, 1).getTime());
			user3.setName("DCH");
			user3.setSex("2");
			user3.setCreatedTime(new Date());
			user3.setMobile("13718868988");
			User user4 = new User();
			user4.setBirthday(new GregorianCalendar(1992, 1, 1).getTime());
			user4.setName("LJJ");
			user4.setSex("1");
			user4.setCreatedTime(new Date());
			user4.setMobile("13718868988");
			User user5 = new User();
			user5.setBirthday(new GregorianCalendar(1992, 1, 1).getTime());
			user5.setName("TRGL");
			user5.setSex("1");
			user5.setCreatedTime(new Date());
			user5.setMobile("13718868988");
			User user6 = new User();
			user6.setBirthday(new GregorianCalendar(1992, 1, 1).getTime());
			user6.setName("XXJ");
			user6.setSex("1");
			user6.setCreatedTime(new Date());
			user6.setMobile("13718868988");
			User user7 = new User();
			user7.setBirthday(new GregorianCalendar(1992, 1, 1).getTime());
			user7.setName("TJC");
			user7.setSex("1");
			user7.setCreatedTime(new Date());
			user7.setMobile("13718868988");
			User user8 = new User();
			user8.setBirthday(new GregorianCalendar(1992, 1, 1).getTime());
			user8.setName("XBY");
			user8.setSex("1");
			user8.setCreatedTime(new Date());
			user8.setMobile("13718868988");
			User user9 = new User();
			user9.setBirthday(new GregorianCalendar(1992, 1, 1).getTime());
			user9.setName("DHH");
			user9.setSex("1");
			user9.setCreatedTime(new Date());
			user9.setMobile("13718868988");
			User user10 = new User();
			user10.setBirthday(new GregorianCalendar(1992, 1, 1).getTime());
			user10.setName("LXN");
			user10.setSex("1");
			user10.setCreatedTime(new Date());
			user10.setMobile("13718868988");
			User user11 = new User();
			user11.setBirthday(new GregorianCalendar(1992, 1, 1).getTime());
			user11.setName("WXC");
			user11.setSex("1");
			user11.setCreatedTime(new Date());
			user11.setMobile("13718868988");
			//
			// 创建设备节点
			Device device = new Device();
			device.setCreatTime(new Date());
			device.setName("Mac Book");
			device.setDescribe("Apple Mac Book Pro");
			Device device2 = new Device();
			device.setCreatTime(new Date());
			device.setName("iphone 5s");
			device.setDescribe("Apple iphone 5s");
			Device device3 = new Device();
			device.setCreatTime(new Date());
			device.setName("iphone 6");
			device.setDescribe("Apple iphone 6");
			Device device4 = new Device();
			device.setCreatTime(new Date());
			device.setName("iphone 6s");
			device.setDescribe("Apple iphone 6s");

			// 创建公司节点
			Company company = new Company();
			company.setName("WXJY");
			company.setAddress("中国技术交易大厦");
			company.setIndustry("互联网教育");
			company.setMobile("010-67768888");

			// 保存节点
			userService.save(user);
			userService.save(user2);
			userService.save(user3);
			userService.save(user4);
			userService.save(user5);
			userService.save(user6);
			userService.save(user7);
			userService.save(user8);
			userService.save(user9);
			userService.save(user10);
			userService.save(user11);
			deviceService.save(device);
			deviceService.save(device2);
			deviceService.save(device3);
			deviceService.save(device4);
			compaynService.save(company);

			// 建立用户与公司的关系，并保存
			User2CompanyRelation user2Company = new User2CompanyRelation(user, company);
			user2Company.setWorkDate(new GregorianCalendar(2015, 11, 9).getTime());
			User2CompanyRelation user2Company2 = new User2CompanyRelation(user2, company);
			user2Company2.setWorkDate(new GregorianCalendar(2015, 3, 1).getTime());
			User2CompanyRelation user2Company3 = new User2CompanyRelation(user3, company);
			user2Company2.setWorkDate(new GregorianCalendar(2016, 4, 1).getTime());
			User2CompanyRelation user2Company4 = new User2CompanyRelation(user4, company);
			user2Company2.setWorkDate(new GregorianCalendar(2016, 4, 1).getTime());
			User2CompanyRelation user2Company5 = new User2CompanyRelation(user5, company);
			user2Company2.setWorkDate(new GregorianCalendar(2016, 4, 1).getTime());
			User2CompanyRelation user2Company6 = new User2CompanyRelation(user6, company);
			user2Company2.setWorkDate(new GregorianCalendar(2016, 4, 1).getTime());
			User2CompanyRelation user2Company7 = new User2CompanyRelation(user7, company);
			user2Company2.setWorkDate(new GregorianCalendar(2016, 4, 1).getTime());
			User2CompanyRelation user2Company8 = new User2CompanyRelation(user8, company);
			user2Company2.setWorkDate(new GregorianCalendar(2016, 4, 1).getTime());
			User2CompanyRelation user2Company9 = new User2CompanyRelation(user9, company);
			user2Company2.setWorkDate(new GregorianCalendar(2016, 4, 1).getTime());
			User2CompanyRelation user2Company10 = new User2CompanyRelation(user10, company);
			user2Company2.setWorkDate(new GregorianCalendar(2016, 4, 1).getTime());
			User2CompanyRelation user2Company11 = new User2CompanyRelation(user11, company);
			user2Company2.setWorkDate(new GregorianCalendar(2016, 4, 1).getTime());
			user2CompanyRepository.save(user2Company);
			user2CompanyRepository.save(user2Company2);
			user2CompanyRepository.save(user2Company3);
			user2CompanyRepository.save(user2Company4);
			user2CompanyRepository.save(user2Company5);
			user2CompanyRepository.save(user2Company6);
			user2CompanyRepository.save(user2Company7);
			user2CompanyRepository.save(user2Company8);
			user2CompanyRepository.save(user2Company9);
			user2CompanyRepository.save(user2Company10);
			user2CompanyRepository.save(user2Company11);

			// 建立用户与设备的关系，并保存
			User2DeviceRelation user2Device = new User2DeviceRelation(user, device);
			User2DeviceRelation user2Device2 = new User2DeviceRelation(user, device2);
			User2DeviceRelation user2Device3 = new User2DeviceRelation(user2, device);
			User2DeviceRelation user2Device4 = new User2DeviceRelation(user2, device3);
			User2DeviceRelation user2Device5 = new User2DeviceRelation(user3, device4);
			User2DeviceRelation user2Device6 = new User2DeviceRelation(user4, device4);
			User2DeviceRelation user2Device7 = new User2DeviceRelation(user5, device4);
			User2DeviceRelation user2Device8 = new User2DeviceRelation(user6, device4);
			User2DeviceRelation user2Device9 = new User2DeviceRelation(user7, device4);
			User2DeviceRelation user2Device10 = new User2DeviceRelation(user8, device4);
			User2DeviceRelation user2Device11 = new User2DeviceRelation(user9, device4);
			User2DeviceRelation user2Device12 = new User2DeviceRelation(user10, device4);
			User2DeviceRelation user2Device13 = new User2DeviceRelation(user11, device4);
			user2DeviceRepository.save(user2Device);
			user2DeviceRepository.save(user2Device2);
			user2DeviceRepository.save(user2Device3);
			user2DeviceRepository.save(user2Device4);
			user2DeviceRepository.save(user2Device6);
			user2DeviceRepository.save(user2Device7);
			user2DeviceRepository.save(user2Device8);
			user2DeviceRepository.save(user2Device9);
			user2DeviceRepository.save(user2Device10);
			user2DeviceRepository.save(user2Device11);
			user2DeviceRepository.save(user2Device12);
			user2DeviceRepository.save(user2Device13);

			// 建立公司与用户的关系
			Company2UserRelation company2UserRelationShip = new Company2UserRelation(company, user);
			Company2UserRelation company2UserRelationShip2 = new Company2UserRelation(company, user2);
			Company2UserRelation company2UserRelationShip3 = new Company2UserRelation(company, user3);
			Company2UserRelation company2UserRelationShip4 = new Company2UserRelation(company, user4);
			Company2UserRelation company2UserRelationShip5 = new Company2UserRelation(company, user5);
			Company2UserRelation company2UserRelationShip6 = new Company2UserRelation(company, user6);
			Company2UserRelation company2UserRelationShip7 = new Company2UserRelation(company, user7);
			Company2UserRelation company2UserRelationShip8 = new Company2UserRelation(company, user8);
			Company2UserRelation company2UserRelationShip9 = new Company2UserRelation(company, user9);
			Company2UserRelation company2UserRelationShip10 = new Company2UserRelation(company, user10);
			Company2UserRelation company2UserRelationShip11 = new Company2UserRelation(company, user11);
			company2UserRepository.save(company2UserRelationShip);
			company2UserRepository.save(company2UserRelationShip2);
			company2UserRepository.save(company2UserRelationShip3);
			company2UserRepository.save(company2UserRelationShip4);
			company2UserRepository.save(company2UserRelationShip5);
			company2UserRepository.save(company2UserRelationShip6);
			company2UserRepository.save(company2UserRelationShip7);
			company2UserRepository.save(company2UserRelationShip8);
			company2UserRepository.save(company2UserRelationShip9);
			company2UserRepository.save(company2UserRelationShip10);
			company2UserRepository.save(company2UserRelationShip11);
			ArrayList<User> userList = new ArrayList<>();
			userList.add(user2);
			userList.add(user3);
			userList.add(user4);
			userList.add(user5);
			userList.add(user6);
			userList.add(user7);
			userList.add(user8);
			userList.add(user9);
			userList.add(user10);
			userList.add(user11);

			for (User u1 : userList) {
                for (User user1 : userList) {
                    if (u1 == user1){
                        continue;
                    }
                    u1.addFriend(user1);
                }
                userService.save(u1);
            }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}